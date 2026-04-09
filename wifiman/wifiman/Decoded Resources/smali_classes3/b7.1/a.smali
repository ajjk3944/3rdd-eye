.class public final Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/a$b;
    }
.end annotation


# instance fields
.field final a:Lb7/b;


# direct methods
.method private constructor <init>(Lb7/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lb7/a;->a:Lb7/b;

    return-void
.end method

.method synthetic constructor <init>(Lb7/b;Lb7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb7/a;-><init>(Lb7/b;)V

    return-void
.end method


# virtual methods
.method public a(Lej/g;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lb7/f;->d0(Lej/g;)Lb7/f;

    move-result-object p1

    invoke-virtual {p1}, Lb7/f;->a()V

    invoke-virtual {p1}, Lb7/f;->S()Ljava/lang/String;

    iget-object v0, p0, Lb7/a;->a:Lb7/b;

    invoke-virtual {v0, p2}, Lb7/b;->a(Ljava/lang/Class;)Ld7/a;

    move-result-object p2

    iget-object v0, p0, Lb7/a;->a:Lb7/b;

    invoke-interface {p2, p1, v0}, Ld7/a;->b(Lb7/f;Lb7/b;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Lb7/f;->h()V

    return-object p2
.end method

.method public b(Lej/f;Ljava/lang/Object;)V
    .locals 3

    invoke-static {p1}, Lb7/h;->a(Lej/f;)Lb7/h;

    move-result-object p1

    iget-object v0, p0, Lb7/a;->a:Lb7/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb7/b;->a(Ljava/lang/Class;)Ld7/a;

    move-result-object v0

    iget-object v1, p0, Lb7/a;->a:Lb7/b;

    invoke-virtual {v1}, Lb7/b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb7/h;->j()Lb7/h;

    :cond_0
    iget-object v1, p0, Lb7/a;->a:Lb7/b;

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, p2, v2}, Ld7/a;->a(Lb7/h;Lb7/b;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
