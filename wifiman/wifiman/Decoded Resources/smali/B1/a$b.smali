.class LB1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB1/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LB1/k$c;

.field final synthetic b:I

.field final synthetic c:LB1/a;


# direct methods
.method constructor <init>(LB1/a;LB1/k$c;I)V
    .locals 0

    iput-object p1, p0, LB1/a$b;->c:LB1/a;

    iput-object p2, p0, LB1/a$b;->a:LB1/k$c;

    iput p3, p0, LB1/a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LB1/a$b;->a:LB1/k$c;

    iget v1, p0, LB1/a$b;->b:I

    invoke-virtual {v0, v1}, LB1/k$c;->a(I)V

    return-void
.end method
