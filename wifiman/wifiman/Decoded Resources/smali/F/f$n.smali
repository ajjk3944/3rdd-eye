.class final LF/f$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->i(LJ/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;


# direct methods
.method constructor <init>(LJ/j;)V
    .locals 0

    iput-object p1, p0, LF/f$n;->a:LJ/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LF/f$n;->a:LJ/j;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LJ/j;->S(Z)LJ/d;

    move-result-object v0

    invoke-virtual {v0}, LJ/d;->d()J

    move-result-wide v0

    return-wide v0
.end method
