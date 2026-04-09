.class final Lr/u0$d;
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
.field public static final a:Lr/u0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/u0$d;

    invoke-direct {v0}, Lr/u0$d;-><init>()V

    sput-object v0, Lr/u0$d;->a:Lr/u0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/m;)F
    .locals 0

    invoke-virtual {p1}, Lr/m;->f()F

    move-result p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    return p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/m;

    invoke-virtual {p0, p1}, Lr/u0$d;->a(Lr/m;)F

    move-result p1

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    return-object p1
.end method
