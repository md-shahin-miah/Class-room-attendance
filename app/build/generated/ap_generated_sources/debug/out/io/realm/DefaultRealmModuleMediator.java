package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(4);
        modelClasses.add(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        modelClasses.add(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        modelClasses.add(com.shahin.classroomattendance.realm.Class_Names.class);
        modelClasses.add(com.shahin.classroomattendance.realm.Students_List.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(4);
        infoMap.put(com.shahin.classroomattendance.realm.Attendance_Reports.class, io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.shahin.classroomattendance.realm.Attendance_Students_List.class, io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.shahin.classroomattendance.realm.Class_Names.class, io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.shahin.classroomattendance.realm.Students_List.class, io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            return io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            return io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            return io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            return io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            return "Attendance_Reports";
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            return "Attendance_Students_List";
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            return "Class_Names";
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            return "Students_List";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
                return clazz.cast(new io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy());
            }
            if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
                return clazz.cast(new io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy());
            }
            if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
                return clazz.cast(new io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy());
            }
            if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
                return clazz.cast(new io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.Attendance_ReportsColumnInfo columnInfo = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.Attendance_ReportsColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Reports.class);
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.copyOrUpdate(realm, columnInfo, (com.shahin.classroomattendance.realm.Attendance_Reports) obj, update, cache, flags));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.Attendance_Students_ListColumnInfo columnInfo = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.copyOrUpdate(realm, columnInfo, (com.shahin.classroomattendance.realm.Attendance_Students_List) obj, update, cache, flags));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            com_shahin_classroomattendance_realm_Class_NamesRealmProxy.Class_NamesColumnInfo columnInfo = (com_shahin_classroomattendance_realm_Class_NamesRealmProxy.Class_NamesColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Class_Names.class);
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.copyOrUpdate(realm, columnInfo, (com.shahin.classroomattendance.realm.Class_Names) obj, update, cache, flags));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            com_shahin_classroomattendance_realm_Students_ListRealmProxy.Students_ListColumnInfo columnInfo = (com_shahin_classroomattendance_realm_Students_ListRealmProxy.Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Students_List.class);
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.copyOrUpdate(realm, columnInfo, (com.shahin.classroomattendance.realm.Students_List) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Attendance_Reports) object, cache);
        } else if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Attendance_Students_List) object, cache);
        } else if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Class_Names) object, cache);
        } else if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Students_List) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
                io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Attendance_Reports) object, cache);
            } else if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
                io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Attendance_Students_List) object, cache);
            } else if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
                io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Class_Names) object, cache);
            } else if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
                io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.insert(realm, (com.shahin.classroomattendance.realm.Students_List) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Attendance_Reports) obj, cache);
        } else if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Attendance_Students_List) obj, cache);
        } else if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Class_Names) obj, cache);
        } else if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Students_List) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
                io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Attendance_Reports) object, cache);
            } else if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
                io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Attendance_Students_List) object, cache);
            } else if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
                io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Class_Names) object, cache);
            } else if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
                io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.insertOrUpdate(realm, (com.shahin.classroomattendance.realm.Students_List) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
                    io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Reports.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy.createDetachedCopy((com.shahin.classroomattendance.realm.Attendance_Reports) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Attendance_Students_List.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createDetachedCopy((com.shahin.classroomattendance.realm.Attendance_Students_List) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Class_Names.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy.createDetachedCopy((com.shahin.classroomattendance.realm.Class_Names) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.shahin.classroomattendance.realm.Students_List.class)) {
            return clazz.cast(io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy.createDetachedCopy((com.shahin.classroomattendance.realm.Students_List) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
