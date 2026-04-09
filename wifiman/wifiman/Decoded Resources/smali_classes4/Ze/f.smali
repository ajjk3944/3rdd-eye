.class public final synthetic LZe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LZe/a;


# direct methods
.method public synthetic constructor <init>(LZe/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZe/f;->a:LZe/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZe/f;->a:LZe/a;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, LZe/c$b$k;->b(LZe/a;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
