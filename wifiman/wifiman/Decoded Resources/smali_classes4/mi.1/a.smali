.class public final Lmi/a;
.super Lki/a;
.source "SourceFile"


# static fields
.field public static final r:Lmi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmi/a;

    invoke-direct {v0}, Lmi/a;-><init>()V

    sput-object v0, Lmi/a;->r:Lmi/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/f;->d()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v2

    move-object v1, v2

    invoke-static {v2}, LVh/b;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    const-string v3, "apply(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LVh/b;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v2, v3

    const-string v4, "packageFqName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LVh/b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v3, v4

    const-string v5, "constructorAnnotation"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LVh/b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v4, v5

    const-string v6, "classAnnotation"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v5, v6

    const-string v7, "functionAnnotation"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->e:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v7, v6

    const-string v8, "propertyAnnotation"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->f:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v8, v6

    const-string v9, "propertyGetterAnnotation"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v9, v6

    const-string v10, "propertySetterAnnotation"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->i:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v13, v6

    const-string v10, "enumEntryAnnotation"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->h:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v14, v6

    const-string v10, "compileTimeValue"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->j:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object v15, v6

    const-string v10, "parameterAnnotation"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->k:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object/from16 v16, v6

    const-string v10, "typeAnnotation"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LVh/b;->l:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-object/from16 v17, v6

    const-string v10, "typeParameterAnnotation"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v17}, Lki/a;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)V

    return-void
.end method

.method private final s(LZh/c;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, LZh/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "default-package"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LZh/c;->g()LZh/f;

    move-result-object p1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "asString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final q(LZh/c;)Ljava/lang/String;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lmi/a;->s(LZh/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".kotlin_builtins"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final r(LZh/c;)Ljava/lang/String;
    .locals 7

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LZh/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "asString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x2e

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lmi/a;->q(LZh/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
