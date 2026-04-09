.class final LT0/j;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field private final a:LL0/i;


# direct methods
.method public constructor <init>(LL0/i;)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput-object p1, p0, LT0/j;->a:LL0/i;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, LT0/j;->a:LL0/i;

    invoke-virtual {p1}, LL0/i;->a()LL0/j;

    return-void
.end method
