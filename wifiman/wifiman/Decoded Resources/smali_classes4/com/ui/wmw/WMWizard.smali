.class public final Lcom/ui/wmw/WMWizard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/WMWizard$a;,
        Lcom/ui/wmw/WMWizard$Error;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/WMWizard;

.field private static b:Li9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/WMWizard;

    invoke-direct {v0}, Lcom/ui/wmw/WMWizard;-><init>()V

    sput-object v0, Lcom/ui/wmw/WMWizard;->a:Lcom/ui/wmw/WMWizard;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LZ8/a$a;
    .locals 1

    sget-object v0, LZ8/a$a$b;->a:LZ8/a$a$b;

    return-object v0
.end method

.method public final b()Li9/a;
    .locals 1

    sget-object v0, Lcom/ui/wmw/WMWizard;->b:Li9/a;

    return-object v0
.end method

.method public final c(Landroid/content/Context;Lh9/a;Lh9/a;)Lgg/z;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "btleMac"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/WMWizard$b;

    invoke-direct {v0, p1, p2, p3}, Lcom/ui/wmw/WMWizard$b;-><init>(Landroid/content/Context;Lh9/a;Lh9/a;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Li9/a;)V
    .locals 0

    sput-object p1, Lcom/ui/wmw/WMWizard;->b:Li9/a;

    return-void
.end method

.method public final e(Ljava/lang/Throwable;)Z
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    invoke-virtual {v0, p1}, Lcom/ui/btle/rxandroidble/a;->e(Ljava/lang/Throwable;)Z

    move-result p1

    :goto_0
    return p1
.end method
