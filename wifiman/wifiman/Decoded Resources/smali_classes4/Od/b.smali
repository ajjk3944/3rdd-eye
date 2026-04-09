.class public final synthetic LOd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, LWc/b;

    invoke-static {p1, p2}, LOd/c;->b(LWc/b;LWc/b;)LWc/b;

    move-result-object p1

    return-object p1
.end method
