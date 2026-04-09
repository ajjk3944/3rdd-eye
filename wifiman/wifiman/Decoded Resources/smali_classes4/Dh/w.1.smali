.class LDh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LDh/x;


# direct methods
.method public constructor <init>(LDh/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/w;->a:LDh/x;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/w;->a:LDh/x;

    invoke-static {v0}, LDh/x;->K0(LDh/x;)Lii/k;

    move-result-object v0

    return-object v0
.end method
