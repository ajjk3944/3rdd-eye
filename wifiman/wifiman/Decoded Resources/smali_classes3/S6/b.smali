.class public final synthetic LS6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LS6/c;


# direct methods
.method public synthetic constructor <init>(LS6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/b;->a:LS6/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS6/b;->a:LS6/c;

    invoke-static {v0}, LS6/c;->o(LS6/c;)LS6/c$b;

    move-result-object v0

    return-object v0
.end method
