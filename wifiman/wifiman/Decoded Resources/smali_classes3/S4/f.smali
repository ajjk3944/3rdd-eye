.class public final synthetic LS4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LS4/g$a;


# direct methods
.method public synthetic constructor <init>(LS4/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS4/f;->a:LS4/g$a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS4/f;->a:LS4/g$a;

    invoke-static {v0}, LS4/g$a;->a(LS4/g$a;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
