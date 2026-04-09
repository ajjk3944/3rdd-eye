.class public final synthetic Lja/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LH/l;


# direct methods
.method public synthetic constructor <init>(LH/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/a;->a:LH/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lja/a;->a:LH/l;

    invoke-static {v0}, Lja/b;->a(LH/l;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
