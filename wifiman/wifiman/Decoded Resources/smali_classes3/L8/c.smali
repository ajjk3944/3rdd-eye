.class public final synthetic LL8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljava/time/LocalDateTime;

.field public final synthetic b:Ljava/time/LocalDateTime;


# direct methods
.method public synthetic constructor <init>(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL8/c;->a:Ljava/time/LocalDateTime;

    iput-object p2, p0, LL8/c;->b:Ljava/time/LocalDateTime;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LL8/c;->a:Ljava/time/LocalDateTime;

    iget-object v1, p0, LL8/c;->b:Ljava/time/LocalDateTime;

    invoke-static {v0, v1}, LL8/d;->a(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Ljava/time/Duration;

    move-result-object v0

    return-object v0
.end method
