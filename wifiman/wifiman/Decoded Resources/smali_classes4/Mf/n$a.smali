.class final LMf/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMf/n;->b(LMf/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LMf/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMf/n$a;

    invoke-direct {v0}, LMf/n$a;-><init>()V

    sput-object v0, LMf/n$a;->a:LMf/n$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n$a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW FW Upgrade stream error"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LMf/n$a;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error;

    if-eqz v0, :cond_0

    new-instance v0, LMf/m;

    invoke-direct {v0}, LMf/m;-><init>()V

    invoke-static {v0, p1}, LNf/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
