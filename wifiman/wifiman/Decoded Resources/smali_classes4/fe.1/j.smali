.class public final synthetic Lfe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:LO7/d;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LO7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lfe/j;->b:LO7/d;

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, Lfe/j;->a:Landroid/content/Context;

    iget-object v1, p0, Lfe/j;->b:LO7/d;

    invoke-static {v0, v1, p1}, Lfe/n;->c(Landroid/content/Context;LO7/d;Lgg/t;)V

    return-void
.end method
