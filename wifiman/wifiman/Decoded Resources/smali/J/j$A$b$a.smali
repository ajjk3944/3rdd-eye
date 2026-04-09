.class final LJ/j$A$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j$A$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LJ/j;Z)V
    .locals 0

    iput-object p1, p0, LJ/j$A$b$a;->a:LJ/j;

    iput-boolean p2, p0, LJ/j$A$b$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object p1, p0, LJ/j$A$b$a;->a:LJ/j;

    invoke-static {p1}, LJ/j;->p(LJ/j;)V

    iget-object p1, p0, LJ/j$A$b$a;->a:LJ/j;

    iget-boolean p2, p0, LJ/j$A$b$a;->b:Z

    if-eqz p2, :cond_0

    sget-object v0, LF/p;->SelectionStart:LF/p;

    goto :goto_0

    :cond_0
    sget-object v0, LF/p;->SelectionEnd:LF/p;

    :goto_0
    invoke-static {p1, p2}, LJ/j;->g(LJ/j;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, LM/w;->a(J)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, LJ/j;->F0(LF/p;J)V

    return-void
.end method
