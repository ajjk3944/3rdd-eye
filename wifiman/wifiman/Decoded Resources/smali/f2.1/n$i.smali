.class final Lf2/n$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;->v(Ljava/util/List;Lf2/r;ZZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lf2/n$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf2/n$i;

    invoke-direct {v0}, Lf2/n$i;-><init>()V

    sput-object v0, Lf2/n$i;->a:Lf2/n$i;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/r;)Lf2/r;
    .locals 2

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf2/r;->v()Lf2/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf2/t;->V()I

    move-result v0

    invoke-virtual {p1}, Lf2/r;->s()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lf2/r;->v()Lf2/t;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/r;

    invoke-virtual {p0, p1}, Lf2/n$i;->a(Lf2/r;)Lf2/r;

    move-result-object p1

    return-object p1
.end method
