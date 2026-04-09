.class public final LAc/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAc/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAc/b;-><init>(Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln7/a$a;

.field final synthetic b:LAc/b;


# direct methods
.method constructor <init>(Ln7/a$a;LAc/b;)V
    .locals 0

    iput-object p1, p0, LAc/b$b;->a:Ln7/a$a;

    iput-object p2, p0, LAc/b$b;->b:LAc/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LAc/b$b;->a:Ln7/a$a;

    invoke-interface {v0, p1}, Ln7/a$a;->a(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LAc/b$b;->b:LAc/b;

    invoke-static {v0}, LAc/b;->b(LAc/b;)Lcom/ui/wifiman/model/vendor/d$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/vendor/d$b;->b(Ljava/lang/String;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
