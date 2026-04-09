.class public final synthetic LK6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# instance fields
.field public final synthetic a:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/q;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LK6/q;->a:Ljava/util/Set;

    check-cast p1, Lhg/c;

    invoke-static {v0, p1}, LK6/t;->c(Ljava/util/Set;Lhg/c;)V

    return-void
.end method
