.class public final synthetic LK6/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:LHg/b;


# direct methods
.method public synthetic constructor <init>(LHg/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/X;->a:LHg/b;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LK6/X;->a:LHg/b;

    check-cast p1, Lgg/s;

    invoke-static {v0, p1}, LK6/g0;->b(LHg/b;Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
