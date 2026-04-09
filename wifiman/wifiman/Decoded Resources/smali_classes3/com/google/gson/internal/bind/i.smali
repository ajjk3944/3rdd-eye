.class public final Lcom/google/gson/internal/bind/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/i$g;,
        Lcom/google/gson/internal/bind/i$e;,
        Lcom/google/gson/internal/bind/i$c;,
        Lcom/google/gson/internal/bind/i$d;,
        Lcom/google/gson/internal/bind/i$f;
    }
.end annotation


# instance fields
.field private final a:Lt5/c;

.field private final b:Lcom/google/gson/c;

.field private final c:Lt5/d;

.field private final d:Lcom/google/gson/internal/bind/d;

.field private final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lt5/c;Lcom/google/gson/c;Lt5/d;Lcom/google/gson/internal/bind/d;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/i;->a:Lt5/c;

    iput-object p2, p0, Lcom/google/gson/internal/bind/i;->b:Lcom/google/gson/c;

    iput-object p3, p0, Lcom/google/gson/internal/bind/i;->c:Lt5/d;

    iput-object p4, p0, Lcom/google/gson/internal/bind/i;->d:Lcom/google/gson/internal/bind/d;

    iput-object p5, p0, Lcom/google/gson/internal/bind/i;->e:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/gson/internal/bind/i;->c(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    return-void
.end method

.method private static c(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p1, p0}, Lt5/m;->a(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x1

    invoke-static {p1, p0}, Lv5/a;->g(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lcom/google/gson/JsonIOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private d(Lcom/google/gson/e;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lcom/google/gson/reflect/a;ZZ)Lcom/google/gson/internal/bind/i$d;
    .locals 14

    move-object v10, p0

    move-object v6, p1

    invoke-virtual/range {p5 .. p5}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lt5/l;->a(Ljava/lang/reflect/Type;)Z

    move-result v8

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    const/4 v7, 0x0

    const/4 v9, 0x1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v11, v9

    goto :goto_0

    :cond_0
    move v11, v7

    :goto_0
    const-class v0, Ls5/b;

    move-object/from16 v12, p2

    invoke-virtual {v12, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ls5/b;

    if-eqz v4, :cond_1

    iget-object v0, v10, Lcom/google/gson/internal/bind/i;->d:Lcom/google/gson/internal/bind/d;

    iget-object v1, v10, Lcom/google/gson/internal/bind/i;->a:Lt5/c;

    const/4 v5, 0x0

    move-object v2, p1

    move-object/from16 v3, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/gson/internal/bind/d;->d(Lt5/c;Lcom/google/gson/e;Lcom/google/gson/reflect/a;Ls5/b;Z)Lcom/google/gson/p;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    move v7, v9

    :cond_2
    move-object/from16 v1, p5

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Lcom/google/gson/e;->l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object v0

    :cond_3
    move-object v9, v0

    if-eqz p6, :cond_5

    if-eqz v7, :cond_4

    move-object v0, v9

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/google/gson/internal/bind/k;

    invoke-virtual/range {p5 .. p5}, Lcom/google/gson/reflect/a;->d()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-direct {v0, p1, v9, v1}, Lcom/google/gson/internal/bind/k;-><init>(Lcom/google/gson/e;Lcom/google/gson/p;Ljava/lang/reflect/Type;)V

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_5
    move-object v6, v9

    :goto_3
    new-instance v13, Lcom/google/gson/internal/bind/i$b;

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p2

    move/from16 v4, p7

    move-object/from16 v5, p3

    move-object v7, v9

    move v9, v11

    invoke-direct/range {v0 .. v9}, Lcom/google/gson/internal/bind/i$b;-><init>(Lcom/google/gson/internal/bind/i;Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Lcom/google/gson/p;Lcom/google/gson/p;ZZ)V

    return-object v13
.end method

.method private static e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;
    .locals 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " declares multiple JSON fields named \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'; conflict is caused by fields "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lv5/a;->f(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lv5/a;->f(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p0, "duplicate-fields"

    invoke-static {p0}, Lt5/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private f(Lcom/google/gson/e;Lcom/google/gson/reflect/a;Ljava/lang/Class;ZZ)Lcom/google/gson/internal/bind/i$f;
    .locals 23

    move-object/from16 v8, p0

    move-object/from16 v9, p3

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/gson/internal/bind/i$f;->c:Lcom/google/gson/internal/bind/i$f;

    return-object v0

    :cond_0
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v12, p2

    move/from16 v0, p4

    move-object v13, v9

    :goto_0
    const-class v1, Ljava/lang/Object;

    if-eq v13, v1, :cond_f

    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v14

    const/4 v15, 0x1

    const/4 v7, 0x0

    if-eq v13, v9, :cond_2

    array-length v1, v14

    if-lez v1, :cond_2

    iget-object v0, v8, Lcom/google/gson/internal/bind/i;->e:Ljava/util/List;

    invoke-static {v0, v13}, Lt5/m;->b(Ljava/util/List;Ljava/lang/Class;)Lcom/google/gson/l;

    move-result-object v0

    sget-object v1, Lcom/google/gson/l;->BLOCK_ALL:Lcom/google/gson/l;

    if-eq v0, v1, :cond_3

    sget-object v1, Lcom/google/gson/l;->BLOCK_INACCESSIBLE:Lcom/google/gson/l;

    if-ne v0, v1, :cond_1

    move v0, v15

    goto :goto_1

    :cond_1
    move v0, v7

    :cond_2
    :goto_1
    move/from16 v16, v0

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/google/gson/JsonIOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "ReflectionAccessFilter does not permit using reflection for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (supertype of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "). Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    array-length v6, v14

    move v5, v7

    :goto_3
    if-ge v5, v6, :cond_e

    aget-object v4, v14, v5

    invoke-direct {v8, v4, v15}, Lcom/google/gson/internal/bind/i;->h(Ljava/lang/reflect/Field;Z)Z

    move-result v17

    invoke-direct {v8, v4, v7}, Lcom/google/gson/internal/bind/i;->h(Ljava/lang/reflect/Field;Z)Z

    move-result v0

    if-nez v17, :cond_4

    if-nez v0, :cond_4

    move/from16 v21, v5

    move/from16 v19, v6

    move/from16 v22, v7

    goto/16 :goto_7

    :cond_4
    const/4 v1, 0x0

    if-eqz p5, :cond_8

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v3, v1

    move/from16 v18, v7

    goto :goto_5

    :cond_5
    invoke-static {v13, v4}, Lv5/a;->h(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-nez v16, :cond_6

    invoke-static {v1}, Lv5/a;->o(Ljava/lang/reflect/AccessibleObject;)V

    :cond_6
    const-class v2, Ls5/c;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v1, v7}, Lv5/a;->g(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/JsonIOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "@SerializedName on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is not supported"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_4
    move/from16 v18, v0

    move-object v3, v1

    :goto_5
    if-nez v16, :cond_9

    if-nez v3, :cond_9

    invoke-static {v4}, Lv5/a;->o(Ljava/lang/reflect/AccessibleObject;)V

    :cond_9
    invoke-virtual {v12}, Lcom/google/gson/reflect/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v13, v1}, Lt5/b;->p(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-direct {v8, v4}, Lcom/google/gson/internal/bind/i;->g(Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/gson/reflect/a;->b(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    move-result-object v19

    move-object/from16 v0, p0

    move-object/from16 p2, v1

    move-object/from16 v1, p1

    move-object/from16 v20, v2

    move-object v2, v4

    move-object v15, v4

    move-object/from16 v4, p2

    move/from16 v21, v5

    move-object/from16 v5, v19

    move/from16 v19, v6

    move/from16 v6, v17

    move/from16 v22, v7

    move/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Lcom/google/gson/internal/bind/i;->d(Lcom/google/gson/e;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lcom/google/gson/reflect/a;ZZ)Lcom/google/gson/internal/bind/i$d;

    move-result-object v0

    if-eqz v18, :cond_b

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v10, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/internal/bind/i$d;

    if-nez v3, :cond_a

    goto :goto_6

    :cond_a
    iget-object v0, v3, Lcom/google/gson/internal/bind/i$d;->b:Ljava/lang/reflect/Field;

    invoke-static {v9, v2, v0, v15}, Lcom/google/gson/internal/bind/i;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_b
    if-eqz v17, :cond_d

    move-object/from16 v1, p2

    invoke-interface {v11, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/internal/bind/i$d;

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    iget-object v0, v0, Lcom/google/gson/internal/bind/i$d;->b:Ljava/lang/reflect/Field;

    invoke-static {v9, v1, v0, v15}, Lcom/google/gson/internal/bind/i;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_d
    :goto_7
    add-int/lit8 v5, v21, 0x1

    move/from16 v6, v19

    move/from16 v7, v22

    const/4 v15, 0x1

    goto/16 :goto_3

    :cond_e
    invoke-virtual {v12}, Lcom/google/gson/reflect/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v13}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v13, v1}, Lt5/b;->p(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/reflect/a;->b(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object v13

    move/from16 v0, v16

    goto/16 :goto_0

    :cond_f
    new-instance v0, Lcom/google/gson/internal/bind/i$f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v11}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v10, v1}, Lcom/google/gson/internal/bind/i$f;-><init>(Ljava/util/Map;Ljava/util/List;)V

    return-object v0
.end method

.method private g(Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 3

    const-class v0, Ls5/c;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ls5/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/internal/bind/i;->b:Lcom/google/gson/c;

    invoke-interface {v0, p1}, Lcom/google/gson/c;->translateName(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {v0}, Ls5/c;->value()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0}, Ls5/c;->alternate()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v1
.end method

.method private h(Ljava/lang/reflect/Field;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/bind/i;->c:Lt5/d;

    invoke-virtual {v0, p1, p2}, Lt5/d;->e(Ljava/lang/reflect/Field;Z)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 10

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object v6

    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v6}, Lv5/a;->l(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Lcom/google/gson/internal/bind/i$a;

    invoke-direct {p1, p0}, Lcom/google/gson/internal/bind/i$a;-><init>(Lcom/google/gson/internal/bind/i;)V

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/gson/internal/bind/i;->e:Ljava/util/List;

    invoke-static {v0, v6}, Lt5/m;->b(Ljava/util/List;Ljava/lang/Class;)Lcom/google/gson/l;

    move-result-object v0

    sget-object v1, Lcom/google/gson/l;->BLOCK_ALL:Lcom/google/gson/l;

    if-eq v0, v1, :cond_4

    sget-object v1, Lcom/google/gson/l;->BLOCK_INACCESSIBLE:Lcom/google/gson/l;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    :goto_0
    move v7, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {v6}, Lv5/a;->m(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v8, Lcom/google/gson/internal/bind/i$g;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v6

    move v4, v7

    invoke-direct/range {v0 .. v5}, Lcom/google/gson/internal/bind/i;->f(Lcom/google/gson/e;Lcom/google/gson/reflect/a;Ljava/lang/Class;ZZ)Lcom/google/gson/internal/bind/i$f;

    move-result-object p1

    invoke-direct {v8, v6, p1, v7}, Lcom/google/gson/internal/bind/i$g;-><init>(Ljava/lang/Class;Lcom/google/gson/internal/bind/i$f;Z)V

    return-object v8

    :cond_3
    iget-object v0, p0, Lcom/google/gson/internal/bind/i;->a:Lt5/c;

    invoke-virtual {v0, p2}, Lt5/c;->b(Lcom/google/gson/reflect/a;)Lt5/j;

    move-result-object v8

    new-instance v9, Lcom/google/gson/internal/bind/i$e;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v6

    move v4, v7

    invoke-direct/range {v0 .. v5}, Lcom/google/gson/internal/bind/i;->f(Lcom/google/gson/e;Lcom/google/gson/reflect/a;Ljava/lang/Class;ZZ)Lcom/google/gson/internal/bind/i$f;

    move-result-object p1

    invoke-direct {v9, v8, p1}, Lcom/google/gson/internal/bind/i$e;-><init>(Lt5/j;Lcom/google/gson/internal/bind/i$f;)V

    return-object v9

    :cond_4
    new-instance p1, Lcom/google/gson/JsonIOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "ReflectionAccessFilter does not permit using reflection for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
