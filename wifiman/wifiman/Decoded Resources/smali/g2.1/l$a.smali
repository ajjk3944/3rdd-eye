.class final Lg2/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/l;->a(Landroid/content/Context;)Lc0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lg2/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg2/l$a;

    invoke-direct {v0}, Lg2/l$a;-><init>()V

    sput-object v0, Lg2/l$a;->a:Lg2/l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;Lf2/w;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual {p2}, Lf2/n;->p0()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, Lf2/w;

    invoke-virtual {p0, p1, p2}, Lg2/l$a;->a(Lc0/m;Lf2/w;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
