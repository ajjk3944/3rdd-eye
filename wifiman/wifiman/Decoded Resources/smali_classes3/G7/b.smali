.class public final LG7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG7/a$a;


# instance fields
.field private a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LG7/c;->a:LG7/c;

    invoke-virtual {v0}, LG7/c;->a()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LG7/b;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(I)LG7/q;
    .locals 1

    iget-object v0, p0, LG7/b;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG7/q;

    return-object p1
.end method
