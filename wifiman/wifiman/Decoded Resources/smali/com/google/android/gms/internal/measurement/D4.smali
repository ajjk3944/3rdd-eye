.class public abstract Lcom/google/android/gms/internal/measurement/D4;
.super Lcom/google/android/gms/internal/measurement/N3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/D4$c;,
        Lcom/google/android/gms/internal/measurement/D4$b;,
        Lcom/google/android/gms/internal/measurement/D4$d;,
        Lcom/google/android/gms/internal/measurement/D4$a;
    }
.end annotation


# static fields
.field private static zzc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/measurement/D4;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected zzb:Lcom/google/android/gms/internal/measurement/K5;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/D4;->zzc:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/N3;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    invoke-static {}, Lcom/google/android/gms/internal/measurement/K5;->k()Lcom/google/android/gms/internal/measurement/K5;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzb:Lcom/google/android/gms/internal/measurement/K5;

    return-void
.end method

.method private final j()I
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/measurement/x5;->zzb(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static l(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/D4;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/D4;->zzc:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/D4;->zzc:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/N5;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    sget v1, Lcom/google/android/gms/internal/measurement/D4$c;->f:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/measurement/D4;->zzc:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method protected static m(Lcom/google/android/gms/internal/measurement/J4;)Lcom/google/android/gms/internal/measurement/J4;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/measurement/J4;->t(I)Lcom/google/android/gms/internal/measurement/J4;

    move-result-object p0

    return-object p0
.end method

.method protected static n(Lcom/google/android/gms/internal/measurement/L4;)Lcom/google/android/gms/internal/measurement/L4;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/measurement/L4;->zza(I)Lcom/google/android/gms/internal/measurement/L4;

    move-result-object p0

    return-object p0
.end method

.method protected static p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/v5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/v5;-><init>(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method static varargs q(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/D4;->B()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/D4;->zzc:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final s(Lcom/google/android/gms/internal/measurement/x5;)I
    .locals 0

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/measurement/x5;->zza(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/measurement/x5;->zza(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private static final t(Lcom/google/android/gms/internal/measurement/D4;Z)Z
    .locals 3

    sget v0, Lcom/google/android/gms/internal/measurement/D4$c;->a:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/measurement/x5;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget p1, Lcom/google/android/gms/internal/measurement/D4$c;->b:I

    if-eqz v0, :cond_2

    move-object v2, p0

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    invoke-virtual {p0, p1, v2, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method protected static x()Lcom/google/android/gms/internal/measurement/K4;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/G4;->f()Lcom/google/android/gms/internal/measurement/G4;

    move-result-object v0

    return-object v0
.end method

.method protected static y()Lcom/google/android/gms/internal/measurement/J4;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/S4;->f()Lcom/google/android/gms/internal/measurement/S4;

    move-result-object v0

    return-object v0
.end method

.method protected static z()Lcom/google/android/gms/internal/measurement/L4;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/t5;->g()Lcom/google/android/gms/internal/measurement/t5;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final A()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/measurement/x5;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4;->B()V

    return-void
.end method

.method final B()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    return-void
.end method

.method public final D()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/D4;->t(Lcom/google/android/gms/internal/measurement/D4;Z)Z

    move-result v0

    return v0
.end method

.method final E()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final a(Lcom/google/android/gms/internal/measurement/x5;)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/D4;->s(Lcom/google/android/gms/internal/measurement/x5;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "serialized size must be non-negative, was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/N3;->h()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/N3;->h()I

    move-result p1

    return p1

    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/D4;->s(Lcom/google/android/gms/internal/measurement/x5;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/N3;->g(I)V

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/measurement/zzjr;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/o4;->I(Lcom/google/android/gms/internal/measurement/zzjr;)Lcom/google/android/gms/internal/measurement/o4;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/x5;->d(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/d6;)V

    return-void
.end method

.method public final synthetic c()Lcom/google/android/gms/internal/measurement/h5;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/measurement/D4$c;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    return-object v0
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/N3;->a(Lcom/google/android/gms/internal/measurement/x5;)I

    move-result v0

    return v0
.end method

.method public final synthetic e()Lcom/google/android/gms/internal/measurement/g5;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/measurement/D4$c;->e:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/measurement/D4;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/x5;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method final g(I)V
    .locals 3

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "serialized size must be non-negative, was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final h()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/D4;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;->j()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/measurement/N3;->zza:I

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;->j()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/N3;->zza:I

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/N3;->zza:I

    return v0
.end method

.method protected final k(Lcom/google/android/gms/internal/measurement/D4;)Lcom/google/android/gms/internal/measurement/D4$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4;->u()Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/D4$b;->l(Lcom/google/android/gms/internal/measurement/D4;)Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object p1

    return-object p1
.end method

.method protected abstract o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/i5;->a(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final u()Lcom/google/android/gms/internal/measurement/D4$b;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/measurement/D4$c;->e:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4$b;

    return-object v0
.end method

.method public final v()Lcom/google/android/gms/internal/measurement/D4$b;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/measurement/D4$c;->e:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4$b;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/D4$b;->l(Lcom/google/android/gms/internal/measurement/D4;)Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    return-object v0
.end method

.method final w()Lcom/google/android/gms/internal/measurement/D4;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/measurement/D4$c;->d:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    return-object v0
.end method
