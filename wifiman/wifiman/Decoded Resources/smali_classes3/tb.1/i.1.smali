.class public final Ltb/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lkb/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkb/j;)V
    .locals 1

    const-string/jumbo v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/i;->a:Ljava/lang/String;

    iput-object p2, p0, Ltb/i;->b:Lkb/j;

    return-void
.end method


# virtual methods
.method public final a()Lkb/j;
    .locals 1

    iget-object v0, p0, Ltb/i;->b:Lkb/j;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltb/i;->a:Ljava/lang/String;

    return-object v0
.end method
