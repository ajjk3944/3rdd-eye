.class public final LN/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;-><init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;


# direct methods
.method constructor <init>(LN/b;)V
    .locals 0

    iput-object p1, p0, LN/b$f;->a:LN/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 1

    iget-object v0, p0, LN/b$f;->a:LN/b;

    invoke-static {v0, p1}, LN/b;->h(LN/b;F)V

    iget-object p1, p0, LN/b$f;->a:LN/b;

    invoke-static {p1, p2}, LN/b;->g(LN/b;F)V

    return-void
.end method
