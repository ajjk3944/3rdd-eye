.class Ldi/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Ldi/q;


# direct methods
.method public constructor <init>(Ldi/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/o;->a:Ldi/q;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldi/o;->a:Ldi/q;

    invoke-static {v0}, Ldi/q;->h(Ldi/q;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
