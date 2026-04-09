.class public final synthetic LK6/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lgg/b;


# direct methods
.method public synthetic constructor <init>(Lgg/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/f0;->a:Lgg/b;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LK6/f0;->a:Lgg/b;

    check-cast p1, Lgg/s;

    invoke-static {v0, p1}, LK6/g0;->j(Lgg/b;Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
