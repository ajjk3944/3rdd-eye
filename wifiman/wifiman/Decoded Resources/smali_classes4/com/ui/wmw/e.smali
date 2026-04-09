.class public final synthetic Lcom/ui/wmw/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wmw/WMWizard$a$a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wmw/WMWizard$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/e;->a:Lcom/ui/wmw/WMWizard$a$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/e;->a:Lcom/ui/wmw/WMWizard$a$a;

    invoke-static {v0}, Lcom/ui/wmw/a$c;->a(Lcom/ui/wmw/WMWizard$a$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
