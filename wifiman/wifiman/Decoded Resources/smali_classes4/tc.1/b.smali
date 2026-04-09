.class public final synthetic Ltc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:Ltc/d;

.field public final synthetic b:Landroid/content/IntentFilter;


# direct methods
.method public synthetic constructor <init>(Ltc/d;Landroid/content/IntentFilter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltc/b;->a:Ltc/d;

    iput-object p2, p0, Ltc/b;->b:Landroid/content/IntentFilter;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 2

    iget-object v0, p0, Ltc/b;->a:Ltc/d;

    iget-object v1, p0, Ltc/b;->b:Landroid/content/IntentFilter;

    invoke-static {v0, v1, p1}, Ltc/d;->b(Ltc/d;Landroid/content/IntentFilter;Lgg/j;)V

    return-void
.end method
