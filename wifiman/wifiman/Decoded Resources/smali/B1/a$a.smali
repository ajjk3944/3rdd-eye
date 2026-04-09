.class LB1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB1/a;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LB1/k$c;

.field final synthetic b:Landroid/graphics/Typeface;

.field final synthetic c:LB1/a;


# direct methods
.method constructor <init>(LB1/a;LB1/k$c;Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, LB1/a$a;->c:LB1/a;

    iput-object p2, p0, LB1/a$a;->a:LB1/k$c;

    iput-object p3, p0, LB1/a$a;->b:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LB1/a$a;->a:LB1/k$c;

    iget-object v1, p0, LB1/a$a;->b:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, LB1/k$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
