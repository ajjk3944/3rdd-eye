.class public final synthetic LM9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/g;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM9/g;->a:Ljava/lang/String;

    check-cast p1, LJ0/w;

    invoke-static {v0, p1}, LM9/i;->a(Ljava/lang/String;LJ0/w;)LYg/J;

    move-result-object p1

    return-object p1
.end method
