.class public final synthetic Li8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:Li8/y;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Li8/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/w;->a:Landroid/content/Intent;

    iput-object p2, p0, Li8/w;->b:Li8/y;

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 2

    iget-object v0, p0, Li8/w;->a:Landroid/content/Intent;

    iget-object v1, p0, Li8/w;->b:Li8/y;

    invoke-static {v0, v1, p1}, Li8/y;->g(Landroid/content/Intent;Li8/y;Lgg/o;)V

    return-void
.end method
