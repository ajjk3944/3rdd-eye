.class public final synthetic LPf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LPf/a;


# direct methods
.method public synthetic constructor <init>(LPf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPf/f;->a:LPf/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LPf/f;->a:LPf/a;

    invoke-static {v0}, LPf/d$c;->a(LPf/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
