.class public final synthetic LIf/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIf/o;


# direct methods
.method public synthetic constructor <init>(LIf/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/x;->a:LIf/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LIf/x;->a:LIf/o;

    invoke-static {v0}, LIf/w$d;->a(LIf/o;)LYg/J;

    move-result-object v0

    return-object v0
.end method
