package de.fhg.fokus.odp.entities.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.fhg.fokus.odp.entities.model.MetadataComment;

import java.util.List;

/**
 * The persistence utility for the metadata comment service. This utility wraps {@link MetadataCommentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetadataCommentPersistence
 * @see MetadataCommentPersistenceImpl
 * @generated
 */
public class MetadataCommentUtil {
    private static MetadataCommentPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(MetadataComment metadataComment) {
        getPersistence().clearCache(metadataComment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<MetadataComment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MetadataComment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MetadataComment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MetadataComment update(MetadataComment metadataComment)
        throws SystemException {
        return getPersistence().update(metadataComment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MetadataComment update(MetadataComment metadataComment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(metadataComment, serviceContext);
    }

    /**
    * Returns all the metadata comments where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the metadata comments where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @return the range of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the metadata comments where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first metadata comment in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first metadata comment in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching metadata comment, or <code>null</code> if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last metadata comment in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last metadata comment in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching metadata comment, or <code>null</code> if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the metadata comments before and after the current metadata comment in the ordered set where uuid = &#63;.
    *
    * @param _id the primary key of the current metadata comment
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a metadata comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment[] findByUuid_PrevAndNext(
        long _id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findByUuid_PrevAndNext(_id, uuid, orderByComparator);
    }

    /**
    * Removes all the metadata comments where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of metadata comments where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns all the metadata comments where userLiferayId = &#63;.
    *
    * @param userLiferayId the user liferay ID
    * @return the matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findByuserLiferayId(
        long userLiferayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserLiferayId(userLiferayId);
    }

    /**
    * Returns a range of all the metadata comments where userLiferayId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userLiferayId the user liferay ID
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @return the range of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findByuserLiferayId(
        long userLiferayId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserLiferayId(userLiferayId, start, end);
    }

    /**
    * Returns an ordered range of all the metadata comments where userLiferayId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userLiferayId the user liferay ID
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findByuserLiferayId(
        long userLiferayId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByuserLiferayId(userLiferayId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first metadata comment in the ordered set where userLiferayId = &#63;.
    *
    * @param userLiferayId the user liferay ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findByuserLiferayId_First(
        long userLiferayId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findByuserLiferayId_First(userLiferayId, orderByComparator);
    }

    /**
    * Returns the first metadata comment in the ordered set where userLiferayId = &#63;.
    *
    * @param userLiferayId the user liferay ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching metadata comment, or <code>null</code> if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchByuserLiferayId_First(
        long userLiferayId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByuserLiferayId_First(userLiferayId, orderByComparator);
    }

    /**
    * Returns the last metadata comment in the ordered set where userLiferayId = &#63;.
    *
    * @param userLiferayId the user liferay ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findByuserLiferayId_Last(
        long userLiferayId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findByuserLiferayId_Last(userLiferayId, orderByComparator);
    }

    /**
    * Returns the last metadata comment in the ordered set where userLiferayId = &#63;.
    *
    * @param userLiferayId the user liferay ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching metadata comment, or <code>null</code> if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchByuserLiferayId_Last(
        long userLiferayId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByuserLiferayId_Last(userLiferayId, orderByComparator);
    }

    /**
    * Returns the metadata comments before and after the current metadata comment in the ordered set where userLiferayId = &#63;.
    *
    * @param _id the primary key of the current metadata comment
    * @param userLiferayId the user liferay ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a metadata comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment[] findByuserLiferayId_PrevAndNext(
        long _id, long userLiferayId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findByuserLiferayId_PrevAndNext(_id, userLiferayId,
            orderByComparator);
    }

    /**
    * Removes all the metadata comments where userLiferayId = &#63; from the database.
    *
    * @param userLiferayId the user liferay ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByuserLiferayId(long userLiferayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByuserLiferayId(userLiferayId);
    }

    /**
    * Returns the number of metadata comments where userLiferayId = &#63;.
    *
    * @param userLiferayId the user liferay ID
    * @return the number of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static int countByuserLiferayId(long userLiferayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByuserLiferayId(userLiferayId);
    }

    /**
    * Returns all the metadata comments where metadataName = &#63;.
    *
    * @param metadataName the metadata name
    * @return the matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findBymetadataName(
        java.lang.String metadataName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBymetadataName(metadataName);
    }

    /**
    * Returns a range of all the metadata comments where metadataName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param metadataName the metadata name
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @return the range of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findBymetadataName(
        java.lang.String metadataName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBymetadataName(metadataName, start, end);
    }

    /**
    * Returns an ordered range of all the metadata comments where metadataName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param metadataName the metadata name
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findBymetadataName(
        java.lang.String metadataName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBymetadataName(metadataName, start, end,
            orderByComparator);
    }

    /**
    * Returns the first metadata comment in the ordered set where metadataName = &#63;.
    *
    * @param metadataName the metadata name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findBymetadataName_First(
        java.lang.String metadataName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findBymetadataName_First(metadataName, orderByComparator);
    }

    /**
    * Returns the first metadata comment in the ordered set where metadataName = &#63;.
    *
    * @param metadataName the metadata name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching metadata comment, or <code>null</code> if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchBymetadataName_First(
        java.lang.String metadataName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBymetadataName_First(metadataName, orderByComparator);
    }

    /**
    * Returns the last metadata comment in the ordered set where metadataName = &#63;.
    *
    * @param metadataName the metadata name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findBymetadataName_Last(
        java.lang.String metadataName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findBymetadataName_Last(metadataName, orderByComparator);
    }

    /**
    * Returns the last metadata comment in the ordered set where metadataName = &#63;.
    *
    * @param metadataName the metadata name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching metadata comment, or <code>null</code> if a matching metadata comment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchBymetadataName_Last(
        java.lang.String metadataName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBymetadataName_Last(metadataName, orderByComparator);
    }

    /**
    * Returns the metadata comments before and after the current metadata comment in the ordered set where metadataName = &#63;.
    *
    * @param _id the primary key of the current metadata comment
    * @param metadataName the metadata name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a metadata comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment[] findBymetadataName_PrevAndNext(
        long _id, java.lang.String metadataName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence()
                   .findBymetadataName_PrevAndNext(_id, metadataName,
            orderByComparator);
    }

    /**
    * Removes all the metadata comments where metadataName = &#63; from the database.
    *
    * @param metadataName the metadata name
    * @throws SystemException if a system exception occurred
    */
    public static void removeBymetadataName(java.lang.String metadataName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBymetadataName(metadataName);
    }

    /**
    * Returns the number of metadata comments where metadataName = &#63;.
    *
    * @param metadataName the metadata name
    * @return the number of matching metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static int countBymetadataName(java.lang.String metadataName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBymetadataName(metadataName);
    }

    /**
    * Caches the metadata comment in the entity cache if it is enabled.
    *
    * @param metadataComment the metadata comment
    */
    public static void cacheResult(
        de.fhg.fokus.odp.entities.model.MetadataComment metadataComment) {
        getPersistence().cacheResult(metadataComment);
    }

    /**
    * Caches the metadata comments in the entity cache if it is enabled.
    *
    * @param metadataComments the metadata comments
    */
    public static void cacheResult(
        java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> metadataComments) {
        getPersistence().cacheResult(metadataComments);
    }

    /**
    * Creates a new metadata comment with the primary key. Does not add the metadata comment to the database.
    *
    * @param _id the primary key for the new metadata comment
    * @return the new metadata comment
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment create(
        long _id) {
        return getPersistence().create(_id);
    }

    /**
    * Removes the metadata comment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param _id the primary key of the metadata comment
    * @return the metadata comment that was removed
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a metadata comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment remove(
        long _id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence().remove(_id);
    }

    public static de.fhg.fokus.odp.entities.model.MetadataComment updateImpl(
        de.fhg.fokus.odp.entities.model.MetadataComment metadataComment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(metadataComment);
    }

    /**
    * Returns the metadata comment with the primary key or throws a {@link de.fhg.fokus.odp.entities.NoSuchMetadataCommentException} if it could not be found.
    *
    * @param _id the primary key of the metadata comment
    * @return the metadata comment
    * @throws de.fhg.fokus.odp.entities.NoSuchMetadataCommentException if a metadata comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment findByPrimaryKey(
        long _id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.fhg.fokus.odp.entities.NoSuchMetadataCommentException {
        return getPersistence().findByPrimaryKey(_id);
    }

    /**
    * Returns the metadata comment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param _id the primary key of the metadata comment
    * @return the metadata comment, or <code>null</code> if a metadata comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.fhg.fokus.odp.entities.model.MetadataComment fetchByPrimaryKey(
        long _id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(_id);
    }

    /**
    * Returns all the metadata comments.
    *
    * @return the metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the metadata comments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @return the range of metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the metadata comments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.fhg.fokus.odp.entities.model.impl.MetadataCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of metadata comments
    * @param end the upper bound of the range of metadata comments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.fhg.fokus.odp.entities.model.MetadataComment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the metadata comments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of metadata comments.
    *
    * @return the number of metadata comments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MetadataCommentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MetadataCommentPersistence) PortletBeanLocatorUtil.locate(de.fhg.fokus.odp.entities.service.ClpSerializer.getServletContextName(),
                    MetadataCommentPersistence.class.getName());

            ReferenceRegistry.registerReference(MetadataCommentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MetadataCommentPersistence persistence) {
    }
}
