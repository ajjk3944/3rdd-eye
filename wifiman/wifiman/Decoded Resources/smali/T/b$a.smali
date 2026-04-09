.class final LT/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LT/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/b$a;

    invoke-direct {v0}, LT/b$a;-><init>()V

    sput-object v0, LT/b$a;->a:LT/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LT/g0;
    .locals 1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, LT/F;->a:LT/F;

    goto :goto_0

    :cond_0
    sget-object v0, LT/Y0;->a:LT/Y0;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/b$a;->a()LT/g0;

    move-result-object v0

    return-object v0
.end method
