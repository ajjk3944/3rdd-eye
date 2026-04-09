.class public final Llb/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llb/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmh/a;)Llb/h;
    .locals 1

    const-string/jumbo v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Llb/h$a;->c(Ljava/lang/Object;)Llb/h$d;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Llb/h$a;->b(Ljava/lang/Throwable;)Llb/h$b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b(Ljava/lang/Throwable;)Llb/h$b;
    .locals 1

    const-string/jumbo v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb/h$b;

    invoke-direct {v0, p1}, Llb/h$b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)Llb/h$d;
    .locals 1

    new-instance v0, Llb/h$d;

    invoke-direct {v0, p1}, Llb/h$d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final serializer(LVi/b;)LVi/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LVi/b;",
            ")",
            "LVi/b;"
        }
    .end annotation

    const-string/jumbo v0, "typeSerial0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb/h$c;

    invoke-direct {v0, p1}, Llb/h$c;-><init>(LVi/b;)V

    return-object v0
.end method
