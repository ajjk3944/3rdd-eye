.class public final LF/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LL0/x;

.field private final b:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LL0/x;Lmh/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/t;->a:LL0/x;

    iput-object p2, p0, LF/t;->b:Lmh/q;

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    iget-object v0, p0, LF/t;->b:Lmh/q;

    return-object v0
.end method

.method public final b()LL0/x;
    .locals 1

    iget-object v0, p0, LF/t;->a:LL0/x;

    return-object v0
.end method
