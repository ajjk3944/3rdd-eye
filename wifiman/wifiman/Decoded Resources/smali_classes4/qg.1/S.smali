.class public final Lqg/S;
.super Lgg/i;
.source "SourceFile"


# static fields
.field public static final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqg/S;

    invoke-direct {v0}, Lqg/S;-><init>()V

    sput-object v0, Lqg/S;->b:Lgg/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 1

    sget-object v0, Lyg/d;->INSTANCE:Lyg/d;

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    return-void
.end method
