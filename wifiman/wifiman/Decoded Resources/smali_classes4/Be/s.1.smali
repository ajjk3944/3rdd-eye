.class public final synthetic LBe/s;
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

    iput-object p1, p0, LBe/s;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBe/s;->a:Ljava/lang/String;

    check-cast p1, Lh4/a;

    invoke-static {v0, p1}, LBe/u;->c(Ljava/lang/String;Lh4/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
