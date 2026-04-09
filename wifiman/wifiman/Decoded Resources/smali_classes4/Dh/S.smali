.class LDh/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LDh/T;

.field private final b:LBh/d;


# direct methods
.method public constructor <init>(LDh/T;LBh/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/S;->a:LDh/T;

    iput-object p2, p0, LDh/S;->b:LBh/d;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LDh/S;->a:LDh/T;

    iget-object v1, p0, LDh/S;->b:LBh/d;

    invoke-static {v0, v1}, LDh/T;->k1(LDh/T;LBh/d;)LDh/T;

    move-result-object v0

    return-object v0
.end method
