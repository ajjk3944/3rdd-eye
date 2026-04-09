.class public final Lcom/ui/wmw/WMWizard$a$a$a$a;
.super Lcom/ui/wmw/WMWizard$a$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/WMWizard$a$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wmw/g;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/g;)V
    .locals 1

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wmw/WMWizard$a$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wmw/WMWizard$a$a$a$a;->a:Lcom/ui/wmw/g;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/wmw/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/WMWizard$a$a$a$a;->a:Lcom/ui/wmw/g;

    return-object v0
.end method
