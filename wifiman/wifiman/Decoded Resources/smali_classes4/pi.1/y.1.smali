.class public final Lpi/y;
.super Lpi/A;
.source "SourceFile"

# interfaces
.implements Lpi/w;
.implements Lri/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/y$a;
    }
.end annotation


# static fields
.field public static final d:Lpi/y$a;


# instance fields
.field private final b:Lpi/d0;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/y;->d:Lpi/y$a;

    return-void
.end method

.method private constructor <init>(Lpi/d0;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lpi/A;-><init>()V

    .line 3
    iput-object p1, p0, Lpi/y;->b:Lpi/d0;

    .line 4
    iput-boolean p2, p0, Lpi/y;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lpi/d0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lpi/y;-><init>(Lpi/d0;Z)V

    return-void
.end method


# virtual methods
.method public B0()Z
    .locals 1

    invoke-virtual {p0}, Lpi/y;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    invoke-virtual {p0}, Lpi/y;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v0, v0, LBh/l0;

    return v0
.end method

.method public O0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/y;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/y;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Lpi/d0;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lpi/y;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/y;

    invoke-virtual {p0}, Lpi/y;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    iget-boolean v1, p0, Lpi/y;->c:Z

    invoke-direct {v0, p1, v1}, Lpi/y;-><init>(Lpi/d0;Z)V

    return-object v0
.end method

.method protected W0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/y;->b:Lpi/d0;

    return-object v0
.end method

.method public bridge synthetic Y0(Lpi/d0;)Lpi/A;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/y;->a1(Lpi/d0;)Lpi/y;

    move-result-object p1

    return-object p1
.end method

.method public final Z0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/y;->b:Lpi/d0;

    return-object v0
.end method

.method public a1(Lpi/d0;)Lpi/y;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/y;

    iget-boolean v1, p0, Lpi/y;->c:Z

    invoke-direct {v0, p1, v1}, Lpi/y;-><init>(Lpi/d0;Z)V

    return-object v0
.end method

.method public i0(Lpi/S;)Lpi/S;
    .locals 1

    const-string v0, "replacement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    iget-boolean v0, p0, Lpi/y;->c:Z

    invoke-static {p1, v0}, Lpi/h0;->e(Lpi/M0;Z)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpi/y;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " & Any"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
