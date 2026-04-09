.class public final Lf/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/IntentSender;

.field private b:Landroid/content/Intent;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 1

    const-string v0, "intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$a;->a:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public final a()Lf/g;
    .locals 5

    new-instance v0, Lf/g;

    iget-object v1, p0, Lf/g$a;->a:Landroid/content/IntentSender;

    iget-object v2, p0, Lf/g$a;->b:Landroid/content/Intent;

    iget v3, p0, Lf/g$a;->c:I

    iget v4, p0, Lf/g$a;->d:I

    invoke-direct {v0, v1, v2, v3, v4}, Lf/g;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public final b(Landroid/content/Intent;)Lf/g$a;
    .locals 0

    iput-object p1, p0, Lf/g$a;->b:Landroid/content/Intent;

    return-object p0
.end method

.method public final c(II)Lf/g$a;
    .locals 0

    iput p1, p0, Lf/g$a;->d:I

    iput p2, p0, Lf/g$a;->c:I

    return-object p0
.end method
