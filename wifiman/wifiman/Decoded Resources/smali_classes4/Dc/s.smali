.class public final synthetic LDc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LDc/t;


# direct methods
.method public synthetic constructor <init>(LDc/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/s;->a:LDc/t;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDc/s;->a:LDc/t;

    invoke-static {v0}, LDc/t;->d(LDc/t;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
