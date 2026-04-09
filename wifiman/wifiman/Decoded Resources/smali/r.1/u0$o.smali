.class final Lr/u0$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lr/u0$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/u0$o;

    invoke-direct {v0}, Lr/u0$o;-><init>()V

    sput-object v0, Lr/u0$o;->a:Lr/u0$o;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ll0/i;)Lr/p;
    .locals 4

    new-instance v0, Lr/p;

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lr/p;-><init>(FFFF)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/i;

    invoke-virtual {p0, p1}, Lr/u0$o;->a(Ll0/i;)Lr/p;

    move-result-object p1

    return-object p1
.end method
