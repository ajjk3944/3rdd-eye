.class public final synthetic LMf/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LMf/a$b;


# direct methods
.method public synthetic constructor <init>(LMf/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMf/o;->a:LMf/a$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMf/o;->a:LMf/a$b;

    invoke-static {v0}, LMf/n$b;->a(LMf/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
