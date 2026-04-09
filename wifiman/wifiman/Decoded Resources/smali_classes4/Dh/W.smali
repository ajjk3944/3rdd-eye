.class LDh/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LDh/V$b;


# direct methods
.method public constructor <init>(LDh/V$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/W;->a:LDh/V$b;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/W;->a:LDh/V$b;

    invoke-static {v0}, LDh/V$b;->N0(LDh/V$b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
