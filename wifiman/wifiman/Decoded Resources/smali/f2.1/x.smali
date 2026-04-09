.class public final Lf2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/x$a;
    }
.end annotation


# static fields
.field public static final c:Lf2/x$a;

.field private static final d:Ljava/lang/ThreadLocal;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lf2/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/x;->c:Lf2/x$a;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lf2/x;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf2/E;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigatorProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/x;->a:Landroid/content/Context;

    iput-object p2, p0, Lf2/x;->b:Lf2/E;

    return-void
.end method
