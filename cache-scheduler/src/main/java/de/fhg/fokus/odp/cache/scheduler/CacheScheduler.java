/**
 * Copyright (c) 2012, 2013 Fraunhofer Institute FOKUS
 *
 * This file is part of Open Data Platform.
 *
 * Open Data Platform is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 * 
 * Open Data Plaform is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Open Data
 * Platform. If not, see <http://www.gnu.org/licenses/agpl-3.0>.
 */

package de.fhg.fokus.odp.cache.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.cache.MultiVMPoolUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

import de.seitenbau.govdata.cache.BaseCache;

/**
 * The Class CacheScheduler is for clearing the cache.
 * 
 * @author Benjamin Dittwald, Fraunhofer FOKUS
 * @author rnoerenberg, SEITENBAU GmbH
 */
public class CacheScheduler implements MessageListener
{

  /** The log. */
  private static final Logger LOG = LoggerFactory.getLogger(CacheScheduler.class);

  /*
   * (non-Javadoc)
   * 
   * @see com.liferay.portal.kernel.messaging.MessageListener#receive(com.liferay
   * .portal.kernel.messaging.Message)
   */
  @Override
  public void receive(Message message) throws MessageListenerException
  {

    LOG.info("Clearing cache: {}", BaseCache.CACHE_NAME_BOXES);
    MultiVMPoolUtil.getCache(BaseCache.CACHE_NAME_BOXES).removeAll();

    LOG.info("Clearing cache: {}", BaseCache.CACHE_NAME_CATEGORIES_GRID);
    MultiVMPoolUtil.getCache(BaseCache.CACHE_NAME_CATEGORIES_GRID).removeAll();

  }

}
