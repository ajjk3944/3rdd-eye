.class public final LWa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWa/a$a;
    }
.end annotation


# static fields
.field public static final b:LWa/a$a;

.field private static final c:LWa/a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LWa/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LWa/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LWa/a;->b:LWa/a$a;

    new-instance v0, LWa/a;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {v0, v1}, LWa/a;-><init>(I)V

    sput-object v0, LWa/a;->c:LWa/a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LWa/a;->a:I

    return-void
.end method

.method public static final synthetic a()LWa/a;
    .locals 1

    sget-object v0, LWa/a;->c:LWa/a;

    return-object v0
.end method


# virtual methods
.method public final b(I)Z
    .locals 1

    iget v0, p0, LWa/a;->a:I

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
