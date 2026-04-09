.class public final synthetic Ln9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/b;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln9/b;->a:Lmh/l;

    invoke-static {v0, p1}, Ln9/c;->a(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
