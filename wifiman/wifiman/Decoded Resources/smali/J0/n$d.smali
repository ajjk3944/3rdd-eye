.class final LJ0/n$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/n;->A()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ0/n$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/n$d;

    invoke-direct {v0}, LJ0/n$d;-><init>()V

    sput-object v0, LJ0/n$d;->a:LJ0/n$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;)Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p1}, LE0/G;->I()LJ0/j;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJ0/j;->u()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    invoke-virtual {p0, p1}, LJ0/n$d;->a(LE0/G;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
