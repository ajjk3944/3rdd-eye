.class public final LN/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LN/H;

.field private final b:LN/K0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LN/H;LN/K0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/E0;->a:LN/H;

    iput-object p2, p0, LN/E0;->b:LN/K0;

    return-void
.end method


# virtual methods
.method public final a()LN/H;
    .locals 1

    iget-object v0, p0, LN/E0;->a:LN/H;

    return-object v0
.end method

.method public final b()LN/K0;
    .locals 1

    iget-object v0, p0, LN/E0;->b:LN/K0;

    return-object v0
.end method
