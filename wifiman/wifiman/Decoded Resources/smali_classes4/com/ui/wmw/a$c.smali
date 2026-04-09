.class final Lcom/ui/wmw/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a;-><init>(Landroid/content/Context;Lh9/a;Lh9/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/a$c;

    invoke-direct {v0}, Lcom/ui/wmw/a$c;-><init>()V

    sput-object v0, Lcom/ui/wmw/a$c;->a:Lcom/ui/wmw/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wmw/WMWizard$a$a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/a$c;->c(Lcom/ui/wmw/WMWizard$a$a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wmw/WMWizard$a$a;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW Connection state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$c;->b(Lcom/ui/wmw/WMWizard$a$a;)V

    return-void
.end method

.method public final b(Lcom/ui/wmw/WMWizard$a$a;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/e;

    invoke-direct {v0, p1}, Lcom/ui/wmw/e;-><init>(Lcom/ui/wmw/WMWizard$a$a;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
